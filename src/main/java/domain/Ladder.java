package domain;

import java.util.List;
import java.util.stream.Stream;

public class Ladder {

    private final Height height;
    private final List<Line> lines;

    public Ladder(int floor, int participantsCount) {
        height = new Height(floor);
        int stepPointCount = participantsCount - 1;
        StepGenerator stepGenerator = new RandomStepGenerator();
        lines = Stream.generate(() -> new Line(stepPointCount, stepGenerator))
                .limit(floor)
                .toList();
    }

    public int findLastLocation(int firstLocation) {
        int presentLocation = firstLocation;
        for (Line line : lines) {
            presentLocation = line.findNextLocation(presentLocation);
        }
        return presentLocation;
    }

    public List<Line> getLines() {
        return lines;
    }
}
