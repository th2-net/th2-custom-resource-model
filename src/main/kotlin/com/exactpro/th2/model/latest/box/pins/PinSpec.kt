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
    val mq: MqSection? = null,
    val grpc: GrpcSection? = null
)

sealed interface Pin {
    val name: String
}

sealed interface MqPin : Pin {
    val attributes: List<String>?
}

sealed interface Linkable : Pin {
    val linkTo: List<LinkEndpoint>?
}

data class MqSubscriber(
    override val name: String = "",
    override val attributes: List<String>? = null,
    val filters: List<FilterSpecMq>? = null,
    val settings: PinSettings? = null,
    override var linkTo: List<LinkEndpoint>? = null
) : MqPin, Linkable

data class MqPublisher(
    override val name: String = "",
    override val attributes: List<String>? = null,
    val filters: List<FilterSpecMq>? = null,
) : MqPin

data class MqSection(
    val subscribers: List<MqSubscriber>? = null,
    val publishers: List<MqPublisher>? = null
)

data class GrpcClient(
    override val name: String = "",
    val serviceClass: String = "",

    val attributes: List<String>? = null,
    val filters: List<FilterSpecGrpc>? = ArrayList(),
    val strategy: String? = null,
    override var linkTo: List<LinkEndpoint>? = null
) : Linkable

data class GrpcServer(
    override val name: String = "",
    val serviceClasses: List<String> = ArrayList(),
) : Pin

data class GrpcSection(
    val client: List<GrpcClient>? = null,
    val server: List<GrpcServer>? = null
)
