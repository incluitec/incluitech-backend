package com.ages.incuitech.backend.solucaodeproblemasservice.business.cliente;

import com.ages.incuitech.backend.solucaodeproblemasservice.api.cliente.ClienteRequest;
import com.ages.incuitech.backend.solucaodeproblemasservice.api.cliente.ClienteResponse;
import com.ages.incuitech.backend.solucaodeproblemasservice.business.domain.StatusCadastro;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
public class ClienteMapper {

    public static Cliente mapToModel(ClienteRequest clienteRequest) {
        return Cliente.builder()
                .nome(clienteRequest.getNome())
                .telefone(clienteRequest.getTelefone())
                .email(clienteRequest.getEmail())
                .statusCadastro(StatusCadastro.P)
                .dataCriacao(LocalDateTime.now())
                .build();
    }

    public static ClienteResponse mapToResponse(Cliente cliente) {
        return ClienteResponse.builder()
                .nome(cliente.getNome())
                .id(cliente.getId())
                .email(cliente.getEmail())
                .telefone(cliente.getTelefone())
                .statusCadastro(cliente.getStatusCadastro())
                .dataCriacao(cliente.getDataCriacao())
                .build();
    }

    public static ClienteResponse mapToResponseWithTags(Cliente cliente, List<String> tags) {
        return mapToResponse(cliente).withTags(tags);
    }
}
