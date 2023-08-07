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

package com.exactpro.th2.model.v2

data class ServiceV2(
    val enabled: Boolean? = false,
    val nodePort: List<NodePortConfigV2>? = null,
    val clusterIP: List<ClusterIpConfigV2>? = null,
    val loadBalancer: List<LoadBalancerConfigV2>? = null,
    val ingress: IngressV2? = null
)

data class NodePortConfigV2(
    val name: String = "",
    val containerPort: Int? = null,
    val exposedPort: Int = -1
)

data class ClusterIpConfigV2(
    val name: String = "",
    val containerPort: Int? = null,
)

data class LoadBalancerConfigV2(
    val name: String = "",
    val containerPort: Int? = null,
)

data class IngressV2(
    val urlPaths: List<String>? = null
)
