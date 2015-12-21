/*
 * Copyright 2014-2015 CyberVision, Inc.
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
package org.kaaproject.kaa.server.common.dao.model.sql.plugin;

import org.kaaproject.kaa.common.dto.plugin.PluginContractInstanceDto;
import org.kaaproject.kaa.common.dto.plugin.PluginContractInstanceItemDto;
import org.kaaproject.kaa.server.common.dao.model.sql.GenericModel;
import org.kaaproject.kaa.server.common.dao.model.sql.ModelUtils;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import static org.kaaproject.kaa.server.common.dao.DaoConstants.PLUGIN_CONTRACT_INSTANCE_PLUGIN_CONTRACT_ID;
import static org.kaaproject.kaa.server.common.dao.DaoConstants.PLUGIN_CONTRACT_INSTANCE_PLUGIN_INSTANCE_ID;
import static org.kaaproject.kaa.server.common.dao.DaoConstants.PLUGIN_CONTRACT_INSTANCE_PROPERTY;
import static org.kaaproject.kaa.server.common.dao.DaoConstants.PLUGIN_CONTRACT_INSTANCE_TABLE_NAME;

@Entity
@Table(name = PLUGIN_CONTRACT_INSTANCE_TABLE_NAME)
public class PluginContractInstance extends GenericModel implements Serializable {

    private static final long serialVersionUID = -6714384962255683537L;

    @ManyToOne
    @JoinColumn(name = PLUGIN_CONTRACT_INSTANCE_PLUGIN_INSTANCE_ID, nullable = false)
    private PluginInstance pluginInstance;

    @ManyToOne
    @JoinColumn(name = PLUGIN_CONTRACT_INSTANCE_PLUGIN_CONTRACT_ID, nullable = false)
    private PluginContract pluginContract;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = PLUGIN_CONTRACT_INSTANCE_PROPERTY)
    private Set<PluginContractInstanceItem> pluginContractInstanceItems = new HashSet<>();

    public PluginInstance getPluginInstance() {
        return pluginInstance;
    }

    public void setPluginInstance(PluginInstance pluginInstance) {
        this.pluginInstance = pluginInstance;
    }

    public PluginContract getPluginContract() {
        return pluginContract;
    }

    public void setPluginContract(PluginContract pluginContract) {
        this.pluginContract = pluginContract;
    }

    public Set<PluginContractInstanceItem> getPluginContractInstanceItems() {
        return pluginContractInstanceItems;
    }

    public void setPluginContractInstanceItems(Set<PluginContractInstanceItem> pluginContractInstanceItems) {
        this.pluginContractInstanceItems = pluginContractInstanceItems;
    }

    public PluginContractInstance() {
    }

    public PluginContractInstance(PluginContractInstanceDto dto) {
        this.id = ModelUtils.getLongId(dto.getId());
        if (dto.getContract() != null) {
            this.pluginContract = new PluginContract(dto.getContract());
        }
        if (dto.getInstance() != null) {
            this.pluginInstance = new PluginInstance(dto.getInstance());
        }
        Set<PluginContractInstanceItemDto> instanceItemDtos = dto.getItems();
        if (instanceItemDtos != null && !instanceItemDtos.isEmpty()) {
            for (PluginContractInstanceItemDto instanceItemDto : instanceItemDtos) {
                pluginContractInstanceItems.add(new PluginContractInstanceItem(instanceItemDto));
            }
        }
    }

    @Override
    protected PluginContractInstanceDto createDto() {
        return new PluginContractInstanceDto();
    }

    @Override
    public PluginContractInstanceDto toDto() {
        PluginContractInstanceDto dto = createDto();
        dto.setId(getStringId());
        dto.setInstance(pluginInstance != null ? pluginInstance.toDto() : null);
        dto.setContract(pluginContract != null ? pluginContract.toDto() : null);
        Set<PluginContractInstanceItemDto> instanceItemDtos = new HashSet<>();
        for (PluginContractInstanceItem pluginContractInstanceItem : pluginContractInstanceItems) {
            instanceItemDtos.add(pluginContractInstanceItem.toDto());
        }
        dto.setItems(instanceItemDtos);
        return dto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PluginContractInstance)) {
            return false;
        }

        PluginContractInstance that = (PluginContractInstance) o;

        if (pluginContract != null ? !pluginContract.equals(that.pluginContract) : that.pluginContract != null) {
            return false;
        }
        if (pluginInstance != null ? !pluginInstance.equals(that.pluginInstance) : that.pluginInstance != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = pluginInstance != null ? pluginInstance.hashCode() : 0;
        result = 31 * result + (pluginContract != null ? pluginContract.hashCode() : 0);
        return result;
    }
}