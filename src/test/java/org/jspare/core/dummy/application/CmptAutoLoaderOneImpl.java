/*
 * Copyright 2016 JSpare.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.jspare.core.dummy.application;

/**
 * The Class CmptAutoLoaderOneImpl.
 *
 * @author pflima
 * @since 30/03/2016
 */
public class CmptAutoLoaderOneImpl implements CmptAutoLoader {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.jspare.core.context.additional.CmptAutoLoader#test()
	 */
	@Override
	public String test() {
		return getClass().getSimpleName();
	}
}
