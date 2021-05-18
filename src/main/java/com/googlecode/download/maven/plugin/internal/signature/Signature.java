/*
 * Copyright 2012, Red Hat Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.download.maven.plugin.internal.signature;

/**
 * Supported signature types with corresponding digest algos.
 * @author Paul Polishchuk
 */
enum Signature {
    MD5("MD5"),
    SHA1("SHA1"),
    SHA256("SHA-256"),
    SHA512("SHA-512");

    private final String algo;

    Signature(final String algo) {
        this.algo = algo;
    }

    String algo() {
        return this.algo;
    }
}
