package org.prebid.server.bidder.thirtythreeacross.proto;

import lombok.AllArgsConstructor;
import lombok.Value;

@AllArgsConstructor(staticName = "of")
@Value
public class ThirtyThreeAcrossImpExtTtx {

    String prod;

    String zoneid;
}
