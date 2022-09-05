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

package com.exactpro.th2.model.latest.box.extendedsettings

import com.exactpro.th2.model.latest.box.ChartConfig
import io.fabric8.kubernetes.api.model.HostAlias
import io.fabric8.kubernetes.api.model.ResourceRequirements

data class ExtendedSettings(
    val chartConfig: ChartConfig? = null,
    val envVariables: Map<String, String>? = null,
    val sharedMemory: SharedMemory? = null,
    val replicas: Int? = null,
    val k8sProbes: Boolean? = null,
    val externalBox: ExternalBox? = null,
    val hostAliases: List<HostAlias>? = null,
    val hostNetwork: Boolean? = null,
    val nodeSelector: Map<String, String>? = null,
    val mounting: List<Mounting>? = null,
    val resources: ResourceRequirements? = null,
    val service: Service? = null
)
