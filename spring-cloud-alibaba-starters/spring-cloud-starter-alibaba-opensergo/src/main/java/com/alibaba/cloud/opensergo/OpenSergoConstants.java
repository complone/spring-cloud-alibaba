/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.cloud.opensergo;

/**
 * @author complone
 */
public final class OpenSergoConstants {

	/**
	 * Prefix of {@link OpenSergoProperties}.
	 */
	public static final String OPENSERGO_BOOTSTRAP = "OPENSERGO_BOOTSTRAP";

	/**
	 * Prefix of {@link OpenSergoProperties}.
	 */
	public static final String OPENSERGO_BOOTSTRAP_CONFIG = "OPENSERGO_BOOTSTRAP_CONFIG";

	private OpenSergoConstants() {
		throw new AssertionError("Must not instantiate constant utility class");
	}

}
