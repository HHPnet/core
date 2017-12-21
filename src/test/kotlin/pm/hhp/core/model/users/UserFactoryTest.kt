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

package pm.hhp.core.model.users

import org.junit.Assert.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class UserFactoryTest {
    private lateinit var userFactory: UserFactory

    @BeforeEach
    fun setUp() {
        userFactory = UserFactory()
    }

    @Test
    fun shouldBePossibleToGenerateAnUserEntityGivenAnUserId() {
        val userId = "8fba4e27-5a93-4d6a-96ad-9d1c9e198a67"

        assertEquals(
                userFactory.getUserEntity(
                        userId,
                        "name",
                        "e@mail.com"
                ).userId.toString(),
                userId
        )
    }

    @Test
    fun shouldBePossibleToGenerateAnUserEntityWithoutGivenAnUserId() {
        val name = "name"
        assertEquals(
                userFactory.getUserEntity(
                        name,
                        "e@mail.com"
                ).name,
                name
        )
    }
}