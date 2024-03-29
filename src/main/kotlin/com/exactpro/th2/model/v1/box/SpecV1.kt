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

package com.exactpro.th2.model.v1.box

import com.exactpro.th2.model.latest.box.ImagePullSecret
import com.exactpro.th2.model.latest.box.Prometheus
import com.exactpro.th2.model.v1.box.extendedsettings.ExtendedSettingsV1
import com.exactpro.th2.model.v1.box.pins.PinSpecV1
import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonProperty

data class SpecV1(
    // required fields
    @JsonProperty("image-name") val imageName: String,
    @JsonProperty("image-version") val imageVersion: String,

    // optional fields
    val type: String?,
    @JsonProperty("version-range") val versionRange: String?,
    @JsonProperty("custom-config") val customConfig: MutableMap<String, Any>?,
    @JsonProperty("extended-settings") val extendedSettings: ExtendedSettingsV1?,
    val pins: List<PinSpecV1>?,
    val prometheus: Prometheus?,
    @JsonAlias("logFile") val loggingConfig: String?,
    val mqRouter: Map<String, Any>?,
    val grpcRouter: Map<String, Any>?,
    val cradleManager: Map<String, Any>?,
    val disabled: Boolean?,
    val imagePullSecrets: List<ImagePullSecret>? = null,
)
