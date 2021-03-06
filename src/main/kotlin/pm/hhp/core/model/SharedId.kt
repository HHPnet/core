/*
 *  Copyright 2016 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package pm.hhp.core.model

import java.util.*

abstract class SharedId {
    private var uuid: UUID

    /**
     * Generates an entity id given a UUID.
     *
     * @param uuid Id of the entity to set up.
     */
    protected constructor(uuid: UUID) {
        this.uuid = uuid
    }

    /** Generates a random entity id.  */
    protected constructor() {
        this.uuid = UUID.randomUUID()
    }

    /**
     * Generates an entity id given an string.
     *
     * @param uuid Id of the entity to set up.
     */
    protected constructor(uuid: String) {
        this.uuid = UUID.fromString(uuid)
    }

    override fun toString(): String {
        return uuid.toString()
    }


}