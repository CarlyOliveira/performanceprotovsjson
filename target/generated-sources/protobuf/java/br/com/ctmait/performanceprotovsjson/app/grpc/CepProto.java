// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cep.proto

package br.com.ctmait.performanceprotovsjson.app.grpc;

public final class CepProto {
  private CepProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cep_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cep_Address_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tcep.proto\022\003cep\"\246\001\n\007Address\022\013\n\003cep\030\001 \001(" +
      "\t\022\022\n\nlogradouro\030\002 \001(\t\022\023\n\013complemento\030\003 \001" +
      "(\t\022\016\n\006bairro\030\004 \001(\t\022\022\n\nlocalidade\030\005 \001(\t\022\n" +
      "\n\002uf\030\006 \001(\t\022\014\n\004ibge\030\007 \001(\t\022\013\n\003gia\030\010 \001(\t\022\013\n" +
      "\003ddd\030\t \001(\t\022\r\n\005siafi\030\n \001(\tBA\n-br.com.ctma" +
      "it.performanceprotovsjson.app.grpcB\010CepP" +
      "rotoP\001\242\002\003CEPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_cep_Address_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cep_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cep_Address_descriptor,
        new java.lang.String[] { "Cep", "Logradouro", "Complemento", "Bairro", "Localidade", "Uf", "Ibge", "Gia", "Ddd", "Siafi", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
