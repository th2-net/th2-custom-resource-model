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

package com.exactpro.th2.model.latest.box.pins

import com.exactpro.th2.model.v1.link.LinkEndpoint

data class PinSpec(
    val mq: MqSection?,
    val grpc: GrpcSection?
)

data class MqSubscriber(
    val name: String,
    val attributes: List<String>?,
    val filters: List<FilterSpecMq>?,
    val settings: PinSettings?,
    var linkTo: MutableList<LinkEndpoint>? = null
)

data class MqPublisher(
    val name: String,
    val attributes: List<String>?,
    val filters: List<FilterSpecMq>?,
)

data class MqSection(
    val subscribers: List<MqSubscriber>?,
    val publishers: List<MqPublisher>?
)

data class GrpcClient(
    val name: String,
    val serviceClass: String,

    val attributes: List<String>?,
    val filters: List<FilterSpecGrpc>?,
    val strategy: String?,
    var linkTo: MutableList<LinkEndpoint>? = null
)

data class GrpcServer(
    val name: String,
    val serviceClasses: List<String>,
)

data class GrpcSection(
    val client: List<GrpcClient>?,
    val server: List<GrpcServer>?
)
