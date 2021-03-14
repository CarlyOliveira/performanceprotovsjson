package br.com.ctmait.performanceprotovsjson.app;

import br.com.ctmait.performanceprotovsjson.app.grpc.Address;
import br.com.ctmait.performanceprotovsjson.app.rest.AddressRest;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class Performance {

    private static ObjectMapper mapper = new ObjectMapper();
    private static AddressRest addressRest;
    private static Address address;

    public static void main(String[] args) {

        addressRest = Performance.generateAddressRest();
        address = Performance.generateAddressGrpc();

        for (int i = 0; i < 5; i++) {
            testPerformance(Performance::restSerializingAndDeserializing, "Json");
            testPerformance(Performance::grpcSerializingAndDeserializing, "proto");
        }
    }

    private static AddressRest generateAddressRest() {
        return AddressRest.builder()
                .cep("Cep")
                .logradouro("logradouro")
                .complemento("complemento")
                .bairro("bairro")
                .localidade("localidade")
                .uf("uf")
                .gia("gia")
                .ddd("ddd")
                .siafi("siafi")
                .build();
    }

    @SneakyThrows
    private static void restSerializingAndDeserializing() {

//        var bytes = mapper.writeValueAsBytes(addressRest);
//        var addressRestDeserializing = mapper.readValue(bytes, AddressRest.class);
        var addressJson = mapper.writeValueAsString(Performance.generateAddressRest());
        var addressRestDeserializing = mapper.readValue(addressJson, AddressRest.class);
    }

    private static Address generateAddressGrpc() {
        return Address.newBuilder()
                .setCep("Cep")
                .setLogradouro("logradouro")
                .setComplemento("complemento")
                .setBairro("bairro")
                .setLocalidade("localidade")
                .setUf("uf")
                .setGia("gia")
                .setDdd("ddd")
                .setSiafi("siafi")
                .build();
    }

    @SneakyThrows
    private static void grpcSerializingAndDeserializing() {
        var bytes = address.toByteArray();
        var adrress = Address.parseFrom(bytes);
    }

    private static void testPerformance(Runnable runnable, String method) {
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            runnable.run();
        }
        long time2 = System.currentTimeMillis();

        System.out.println(method + " : " + (time2 - time1) + " ms");
    }
}
