package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    private  Map<Long, TimeEntry> map = new HashMap<>();

    public TimeEntry create(TimeEntry timeEntry) {
        Long id = map.size() + 1L;
        TimeEntry created = new TimeEntry(id, timeEntry.getProjectId(), timeEntry.getUserId(), timeEntry.getDate(), timeEntry.getHours());
        map.put(id, created);
        return created;
    }

    public TimeEntry find(long id) {
        TimeEntry read = map.get(id);
        return read;
    }

    public TimeEntry update(long id, TimeEntry timeEntry) {
        TimeEntry updated = map.get(id);
        updated.setProjectId(timeEntry.getProjectId());
        updated.setUserId(timeEntry.getUserId());
        updated.setDate(timeEntry.getDate());
        updated.setHours(timeEntry.getHours());
        map.put(id, updated);
        return updated;
    }

    public List<TimeEntry> list() {
        return new ArrayList<TimeEntry>(map.values());
    }

    public void delete(long id) {
        map.remove(id);
    }
}
