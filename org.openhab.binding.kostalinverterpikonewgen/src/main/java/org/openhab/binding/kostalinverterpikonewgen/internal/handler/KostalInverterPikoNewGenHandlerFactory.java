/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.openhab.binding.kostalinverterpikonewgen.internal.handler;

import static org.openhab.binding.kostalinverterpikonewgen.internal.KostalInverterPikoNewGenBindingConstants.THING_TYPE_KOSTALINVERTERPIKONEWGEN;

import java.util.Collections;
import java.util.Set;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandlerFactory;
import org.eclipse.smarthome.core.thing.binding.ThingHandler;
import org.eclipse.smarthome.core.thing.binding.ThingHandlerFactory;
import org.osgi.service.component.annotations.Component;

/**
 * The {@link KostalInverterPikoNewGenHandlerFactory} is responsible for creating things and thing
 * handlers.
 *
 * @author Örjan Backsell - Initial contribution
 */
@NonNullByDefault
@Component(configurationPid = "binding.kostalinverterpikonewgen", service = ThingHandlerFactory.class)
public class KostalInverterPikoNewGenHandlerFactory extends BaseThingHandlerFactory {

    private static final Set<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = Collections
            .singleton(THING_TYPE_KOSTALINVERTERPIKONEWGEN);

    @Override
    public boolean supportsThingType(ThingTypeUID thingTypeUID) {
        return SUPPORTED_THING_TYPES_UIDS.contains(thingTypeUID);
    }

    @Override
    protected @Nullable ThingHandler createHandler(Thing thing) {
        ThingTypeUID thingTypeUID = thing.getThingTypeUID();

        if (THING_TYPE_KOSTALINVERTERPIKONEWGEN.equals(thingTypeUID)) {
            return new KostalInverterPikoNewGenHandler(thing);
        }

        return null;
    }
}
