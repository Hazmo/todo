package co.uk.harryabaker.todo.domain.utils;

import lombok.experimental.UtilityClass;
import org.hashids.Hashids;

import java.util.concurrent.ThreadLocalRandom;

@UtilityClass
public class HashIdUtils {

    private static final long BOUND = 1000000L;
    private final Hashids hashids = new Hashids("", 5);

    public static String getId() {
        return hashids.encode(ThreadLocalRandom.current().nextLong(BOUND));
    }
}
