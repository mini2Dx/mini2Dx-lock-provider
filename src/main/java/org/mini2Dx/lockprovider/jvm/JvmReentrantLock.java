/*******************************************************************************
 * Copyright 2019 See AUTHORS file
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.mini2Dx.lockprovider.jvm;

import org.mini2Dx.lockprovider.ReentrantLock;

/**
 * Default implementation of {@link ReentrantLock} for JVM environments
 */
public class JvmReentrantLock implements ReentrantLock {
	private final java.util.concurrent.locks.ReentrantLock lock = new java.util.concurrent.locks.ReentrantLock();

	@Override
	public boolean isHeldByCurrentThread() {
		return lock.isHeldByCurrentThread();
	}

	@Override
	public void lock() {
		lock.lock();
	}

	@Override
	public boolean tryLock() {
		return lock.tryLock();
	}

	@Override
	public void unlock() {
		lock.unlock();
	}
}
