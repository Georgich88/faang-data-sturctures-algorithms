package com.georgeisaev.faang.leetcode.alg.array.easy.sort.meetingrooms;

import java.util.Arrays;

public class MeetingRoomsImpl implements MeetingRooms {

    @Override
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }
        return true;
    }

}
