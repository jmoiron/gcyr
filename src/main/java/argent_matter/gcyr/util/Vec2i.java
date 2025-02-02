package argent_matter.gcyr.util;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.jetbrains.annotations.NotNull;

public record Vec2i(int x, int y) implements Comparable<Vec2i> {
    public static final Codec<Vec2i> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("x").forGetter(Vec2i::x),
            Codec.INT.fieldOf("y").forGetter(Vec2i::y)
    ).apply(instance, Vec2i::new));

    public static final Vec2i ZERO = new Vec2i(0, 0);
    public static final Vec2i MAX_NEGATIVE = new Vec2i(Integer.MIN_VALUE, Integer.MIN_VALUE);


    public int distanceToSqr(Vec2i other) {
        int f = other.x - this.x;
        int g = other.y - this.y;
        return f * f + g * g;
    }

    @Override
    public int compareTo(@NotNull Vec2i other) {
        return this.x == other.x ? this.y - other.y : this.x - other.x;
    }
}
