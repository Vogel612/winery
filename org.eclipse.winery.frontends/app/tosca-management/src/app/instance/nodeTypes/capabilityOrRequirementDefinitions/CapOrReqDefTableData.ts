/*******************************************************************************
 * Copyright (c) 2017 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache Software License 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 *******************************************************************************/
export class CapOrRegDefinitionsTableData {
    name: string = null;
    type: string = null;
    lowerBound: string = null;
    upperBound: string = null;
    constraints: string = null;
    typeUri: string = null;

    constructor(name: string, type: string, lowerBound: string, upperBound: string, constraints: string, typeUri: string) {
        this.name = name;
        this.type = type;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.constraints = constraints;
        this.typeUri = typeUri;
    }
}
