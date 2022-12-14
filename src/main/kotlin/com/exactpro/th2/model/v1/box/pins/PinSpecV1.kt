/*
 * Copyright 2020-2022 Exactpro (Exactpro Systems Limited)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.exactpro.th2.model.v1.box.pins

import com.exactpro.th2.model.latest.box.pins.PinSettings
import com.fasterxml.jackson.annotation.JsonProperty

data class PinSpecV1(
    // required
    val name: String,
    @JsonProperty("connection-type") val connectionType: String,

    // optional
    @JsonProperty("service-class") val serviceClass: String?,
    @JsonProperty("service-classes") val serviceClasses: List<String>?,
    val attributes: List<String>?,
    val strategy: String?,
    val filters: List<FilterSpecV1>?,
    val settings: PinSettings?
)

enum class PinType(val value: String) {
    MQ("mq"),
    GRPC_CLIENT("grpc-client"),
    GRPC_SERVER("grpc-server"),
}
