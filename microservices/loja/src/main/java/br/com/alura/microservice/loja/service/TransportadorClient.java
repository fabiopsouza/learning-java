package br.com.alura.microservice.loja.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.alura.microservice.loja.dto.InfoEntregaDTO;
import br.com.alura.microservice.loja.dto.VoucherDTO;

@FeignClient("transportador")
public interface TransportadorClient {

	@RequestMapping(path = "/entrega", method = RequestMethod.POST)
	public VoucherDTO reservaEntrega(@RequestBody InfoEntregaDTO pedidoDTO);
}
