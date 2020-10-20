package technoStudy.Day23;

import java.util.Arrays;
import java.util.HashSet;

public class Task1 {
    // let's say we have a company with 2 teams:
    // team devs: Jon, Austin, Shane, Kyle, Max
    // team testers: Austin, Max, Douglas, Arya, Alice

    // find out how many people are working in the company and who are they
    // create a method that returns set of unique people -> public static HashSet<String> uniqueMembers(HashSet<String> teamA, HashSet<String> teamB) {
    // then print the set and the size of the set -> main method

    // find out how many ppl are working in both teams and who are they

    // find out how many ppl are working in single team only, and who are they

    public static void main(String[] args) {
        // create two sets of devs and testers
        HashSet<String> devs = new HashSet<>();
        HashSet<String> testers = new HashSet<>();

//        HashSet<String> set = new HashSet<>(Arrays.asList("Jon", "Austin", "Shane", "Kyle", "Max"));

        addAll(devs, "Jon", "Austin", "Shane", "Kyle", "Max");
        addAll(testers, "Austin", "Max", "Douglas", "Arya", "Alice");

        HashSet<String> uniqueMembers = uniqueMembers(devs, testers);
        System.out.println(uniqueMembers);
        System.out.println(uniqueMembers.size());

        HashSet<String> pplOnBothTeams = intersectingMembers(devs, testers);
        System.out.println(pplOnBothTeams);
        System.out.println(pplOnBothTeams.size());

        HashSet<String> singleTeamMembers = singleTeamMembers(devs, testers);
        System.out.println(singleTeamMembers);
        System.out.println(singleTeamMembers.size());
    }

    public static void addAll(HashSet<String> set, String... elements) {
        for (int i = 0; i < elements.length; i++) {
            set.add(elements[i]);
        }
    }

    //  inside method create a new set, and use addAll function to add teamA and teamB to the set
    public static HashSet<String> uniqueMembers(HashSet<String> teamA, HashSet<String> teamB) {
        HashSet<String> result = new HashSet<>();
        result.addAll(teamA);
        result.addAll(teamB);
        return result;
    }

    public static HashSet<String> intersectingMembers(HashSet<String> teamA, HashSet<String> teamB) {
        HashSet<String> result = new HashSet<>(); // result is empty hashset
        result.addAll(teamA); // make a copy of teamA,
        result.retainAll(teamB); // intersect result and teamB and store in result
        return result;
    }

    public static HashSet<String> singleTeamMembers(HashSet<String> teamA, HashSet<String> teamB) {
        // find all unique members
        HashSet<String> uniqueMembers = uniqueMembers(teamA, teamB);
        // find all intersecting members
        HashSet<String> intersectingMembers = intersectingMembers(teamA, teamB);
        // then remove from unique members all intersecting members
        uniqueMembers.removeAll(intersectingMembers);
        return uniqueMembers;
    }
}

