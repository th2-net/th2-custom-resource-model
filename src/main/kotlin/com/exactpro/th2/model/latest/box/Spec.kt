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

package com.exactpro.th2.model.latest.box

import com.exactpro.th2.model.latest.box.extendedsettings.ExtendedSettings
import com.exactpro.th2.model.latest.box.pins.PinSpec

data class Spec(
    // required fields
    val imageName: String = "",
    val imageVersion: String = "",

    // optional fields
    val type: String? = null,
    val versionRange: String? = null,
    var customConfig: MutableMap<String, Any>? = null,
    val extendedSettings: ExtendedSettings? = null,
    val pins: PinSpec? = null,
    val prometheus: Prometheus? = null,
    val loggingConfig: String? = null,
    val mqRouter: Map<String, Any>? = null,
    val grpcRouter: Map<String, Any>? = null,
    val cradleManager: Map<String, Any>? = null,
    val disabled: Boolean? = false,
    val bookName: String? = null
)
