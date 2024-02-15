//package com.example.demo;
//
//import org.springframework.stereotype.Component;
//
//import java.util.HashMap;
//import java.util.Map;
//
////@Component("InMemoryUserRepository")
////@Component
//public class InMemoryUserRepository implements UserRepository{
//    private Map<Integer, User> userMap = new HashMap<>();
//
//    public InMemoryUserRepository() {
//        User batheesha = new User();
//        batheesha.id =1;
//        batheesha.name = "Batheesha";
//        batheesha.age = 23;
//        batheesha.tp = "773968486";
//        userMap.put(1,batheesha);
//
//        User kamal = new User();
//        kamal.id = 2;
//        kamal.name = "Kamal";
//        kamal.age = 26;
//        kamal.tp = "993678123";
//        userMap.put(2,kamal);
//    }
//
//    @Override
//    public User findById(int id){
//        return userMap.get(id);
//    }
//
//    @Override
//    public void save(User user) {
//        userMap.put(user.id,user);
//    }
//
//    @Override
//    public User remove(int id) {
//        return userMap.remove(id);
//    }
//
//}
