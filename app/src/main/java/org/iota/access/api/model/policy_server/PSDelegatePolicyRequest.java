/*
 *  This file is part of the IOTA Access distribution
 *  (https://github.com/iotaledger/access)
 *
 *  Copyright (c) 2020 IOTA Stiftung.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.iota.access.api.model.policy_server;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Map;

@SuppressWarnings("FieldCanBeLocal")
public class PSDelegatePolicyRequest extends PSSendCommandRequest implements Serializable {

    @SerializedName("owner")
    private String owner;
    @SerializedName("deviceId")
    private String deviceId;
    @SerializedName("policy")
    private Map<String, Object> policy;
    @SerializedName("signature")
    private String signature;

    public PSDelegatePolicyRequest(
            final String owner,
            final String deviceId,
            final Map<String, Object> policy,
            final String signature
    ) {
        super("add_policy");
        this.owner = owner;
        this.deviceId = deviceId;
        this.policy = policy;
        this.signature = signature;
    }

}
