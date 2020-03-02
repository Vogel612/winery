/*******************************************************************************
<<<<<<< HEAD:org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/OTTopologyFragmentRefinementModel.java
 * Copyright (c) 2018-2020 Contributors to the Eclipse Foundation
=======
 * Copyright (c) 2019 Contributors to the Eclipse Foundation
>>>>>>> 4a8adcd16... Push xml-model into an xml subpackage to avoid naming collisions with canonical model:org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/TPatternRefinementModel.java
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

package org.eclipse.winery.model.tosca.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otTopologyFragmentRefinementModel")
public class OTTopologyFragmentRefinementModel extends OTRefinementModel {

    @XmlElement(name = "RefinementStructure")
    protected TTopologyTemplate refinementStructure;

    @XmlElementWrapper(name = "AttributeMappings")
    @XmlElement(name = "AttributeMapping")
    protected List<OTAttributeMapping> attributeMappings;

    @XmlElementWrapper(name = "StayMappings")
    @XmlElement(name = "StayMapping")
    protected List<OTStayMapping> stayMappings;

    @XmlElementWrapper(name = "DeploymentArtifactMappings")
    @XmlElement(name = "DeploymentArtifactMapping")
    protected List<OTDeploymentArtifactMapping> deploymentArtifactMappings;

    @NonNull
    @XmlTransient
    public TTopologyTemplate getRefinementTopology() {
        if (refinementStructure == null) {
            refinementStructure = new TTopologyTemplate();
        }
        return refinementStructure;
    }

    public TTopologyTemplate getRefinementStructure() {
        return getRefinementTopology();
    }

    public void setRefinementTopology(TTopologyTemplate refinementStructure) {
        this.refinementStructure = refinementStructure;
    }

    @Nullable
    public List<OTAttributeMapping> getAttributeMappings() {
        return attributeMappings;
    }

    public void setAttributeMappings(List<OTAttributeMapping> attributeMappings) {
        this.attributeMappings = attributeMappings;
    }

    @Nullable
    public List<OTStayMapping> getStayMappings() {
        return stayMappings;
    }

    public void setStayMappings(List<OTStayMapping> stayMappings) {
        this.stayMappings = stayMappings;
    }

    @Nullable
    public List<OTDeploymentArtifactMapping> getDeploymentArtifactMappings() {
        return deploymentArtifactMappings;
    }

    public void setDeploymentArtifactMappings(List<OTDeploymentArtifactMapping> deploymentArtifactMappings) {
        this.deploymentArtifactMappings = deploymentArtifactMappings;
    }
}