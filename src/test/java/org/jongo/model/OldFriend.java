/*
 * Copyright (C) 2011 Benoit GUEROUT <bguerout at gmail dot com> and Yves AMSELLEM <amsellem dot yves at gmail dot com>
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

package org.jongo.model;

import org.bson.types.ObjectId;
import org.jongo.marshall.jackson.id.Id;
import org.jongo.marshall.jackson.id.Oid;

public class OldFriend {

    @Id
    private String id;
    private String name;

    public OldFriend(ObjectId id, String name) {
        this.id = id.toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getOid() {
        return Oid.from(id);
    }

    public String getName() {
        return name;
    }
}
