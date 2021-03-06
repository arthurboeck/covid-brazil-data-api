package br.com.covid.brazil.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "${service.brasilIoApi.url}", value = "brasilIoApi")
interface IBrasilIoClient {
    @GetMapping(path = "caso_full/data/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    BrasilIoDTO getCovidData(@RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                             @RequestParam("is_last") String ehUltimaAtualizacao,
                             @RequestParam("state") String uf,
                             @RequestParam("city") String municipio);
}
