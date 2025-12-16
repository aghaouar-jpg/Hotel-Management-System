package hotel.management.system.benchmark;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
@Warmup(iterations = 2)
@Measurement(iterations = 3)
@Fork(1)
public class RoomBenchmark {

    @Benchmark
    public void createRoom() {
        String room = "Room-" + System.nanoTime();
    }
}
