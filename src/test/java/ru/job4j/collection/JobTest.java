package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenAscByNameAndAscPriority() {
        Comparator<Job> cmp = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmp.compare(
                new Job("aaaaaa", 1),
                new Job("aaa", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenJobDescByName() {
        Job first = new Job("aaaa", 1);
        Job second = new Job("aaaaa", 4);
        Job third = new Job("aaaaaaaaaa", 2);
        List<Job> jobs = new ArrayList<>();
        jobs.add(first);
        jobs.add(third);
        jobs.add(second);
        List<Job> expected = List.of(third, second, first);
        Collections.sort(jobs, new JobDescByName());
        assertThat(jobs, is(expected));
    }

    @Test
    public void whenJobAscByName() {
        Job one = new Job("Fix bug", 1);
        Job two = new Job("Make a deal", 4);
        Job three = new Job("Do best", 2);
        List<Job> jobs = new ArrayList<>();
        jobs.add(one);
        jobs.add(two);
        jobs.add(three);
        List<Job> expected = List.of(three, one, two);
        Collections.sort(jobs, new JobAscByName());
        assertThat(jobs, is(expected));
    }

    @Test
    public void whenJobAscByPriority() {
        Job first = new Job("aaaaaa", 1);
        Job second = new Job("aaaaaaa", 3);
        Job third = new Job("a", 2);
        List<Job> jobs = new ArrayList<>();
        jobs.add(first);
        jobs.add(second);
        jobs.add(third);
        List<Job> expected = List.of(first, third, second);
        Collections.sort(jobs, new JobAscByPriority());
        assertThat(jobs, is(expected));
    }

    @Test
    public void whenJobDescByPriority() {
        Job first = new Job("aaaaa", 1);
        Job second = new Job("aa", 4);
        Job third = new Job("aaa", 2);
        List<Job> jobs = new ArrayList<>();
        jobs.add(first);
        jobs.add(second);
        jobs.add(third);
        List<Job> expected = List.of(second, third, first);
        Collections.sort(jobs, new JobDescByPriority());
        assertThat(jobs, is(expected));
    }
}