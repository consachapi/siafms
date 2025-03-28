package pe.gob.cusco.siafms.application.feigns;

import feign.Contract;
import feign.Feign;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;
import pe.gob.cusco.siafms.core.config.ConfigSiafms;

@Service("ejecucionMetaController")
@Import(FeignClientsConfiguration.class)
public class FeignServiceController {
    private final Decoder decoder;
    private final Encoder encoder;
    private final Contract contract;

    private final ConfigSiafms configSiafms;

    public FeignServiceController(Decoder decoder, Encoder encoder, Contract contract, ConfigSiafms configSiafms) {
        this.decoder = decoder;
        this.encoder = encoder;
        this.contract = contract;
        this.configSiafms = configSiafms;
    }

    public <T> T creating( Class<T> apiType) {
        return Feign.builder()
                .encoder(encoder)
                .decoder(decoder)
                .contract(contract)
                .target(apiType, configSiafms.getUrl());
    }

}
