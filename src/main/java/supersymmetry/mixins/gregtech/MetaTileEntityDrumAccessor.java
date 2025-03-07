package supersymmetry.mixins.gregtech;

import gregtech.api.capability.IPropertyFluidFilter;
import gregtech.common.metatileentities.storage.MetaTileEntityDrum;
import org.jetbrains.annotations.ApiStatus.ScheduledForRemoval;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Deprecated
@ScheduledForRemoval(inVersion = "Next CEu update")
@Mixin(value = MetaTileEntityDrum.class, remap = false)
public interface MetaTileEntityDrumAccessor {

    @Accessor("fluidFilter")
    IPropertyFluidFilter getFluidFilter();

    @Accessor("color")
    int getColor();

    @Accessor("tankSize")
    int getTankSize();

    @Accessor("isAutoOutput")
    boolean isAutoOutput();
}
