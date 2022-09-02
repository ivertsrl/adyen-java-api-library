package com.adyen.service.resource.binlookup;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.service.Resource;

import java.util.Arrays;

public class GetCostEstimate extends Resource {

    public GetCostEstimate(Service service) {
        super(service,
                service.getClient().getConfig().getEndpoint() + Client.BIN_LOOKUP_PAL_SUFFIX + Client.BIN_LOOKUP_API_VERSION + "/getCostEstimate",
              Arrays.asList("merchantAccount", "amount"));
    }
}
