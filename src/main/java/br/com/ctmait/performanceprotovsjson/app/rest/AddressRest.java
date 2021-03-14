package br.com.ctmait.performanceprotovsjson.app.rest;


import lombok.*;


@ToString
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressRest {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;
}
