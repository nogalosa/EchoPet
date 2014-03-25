/*
 * This file is part of EchoPet.
 *
 * EchoPet is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * EchoPet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with EchoPet.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.dsh105.echopet.entity.type.ocelot;


import io.github.dsh105.echopet.entity.*;
import org.bukkit.entity.Ocelot.Type;
import org.bukkit.entity.Player;

@EntityPetType(petType = PetType.OCELOT)
public class OcelotPet extends Pet implements IAgeablePet {

    boolean baby;
    Type type = Type.WILD_OCELOT;

    public OcelotPet(Player owner) {
        super(owner);
    }

    public OcelotPet(String owner, EntityPet entityPet) {
        super(owner, entityPet);
    }

    @Override
    public void setBaby(boolean flag) {
        ((EntityOcelotPet) getEntityPet()).setBaby(flag);
        this.baby = flag;
    }

    @Override
    public boolean isBaby() {
        return this.baby;
    }

    public Type getCatType() {
        return type;
    }

    public void setCatType(Type t) {
        setCatType(t.getId());
        this.type = t;
    }

    public void setCatType(int i) {
        ((EntityOcelotPet) getEntityPet()).setCatType(i);
        this.type = Type.getType(i);
    }
}