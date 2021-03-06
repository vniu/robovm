/*
 * Copyright (C) 2012 Trillian AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.cocoatouch.uikit;

import org.robovm.rt.bro.Bits;

public final class UIDataDetectorTypes extends Bits<UIDataDetectorTypes> {
	public static final UIDataDetectorTypes PhoneNumber = new UIDataDetectorTypes(1 << 0);
	public static final UIDataDetectorTypes Link = new UIDataDetectorTypes(1 << 1);
	public static final UIDataDetectorTypes Address = new UIDataDetectorTypes(1 << 2);
	public static final UIDataDetectorTypes CalendarEvent = new UIDataDetectorTypes(1 << 3);
	public static final UIDataDetectorTypes None = new UIDataDetectorTypes(0);
	public static final UIDataDetectorTypes All = new UIDataDetectorTypes(0xFFFFFFFF);

    private static final UIDataDetectorTypes[] values = _values(UIDataDetectorTypes.class);
    
    private UIDataDetectorTypes(long value) { super(value); }
    private UIDataDetectorTypes(long value, long mask) { super(value, mask); }
    protected UIDataDetectorTypes wrap(long value, long mask) {
        return new UIDataDetectorTypes(value, mask);
    }
    protected UIDataDetectorTypes[] values() {
        return values;
    }
}
