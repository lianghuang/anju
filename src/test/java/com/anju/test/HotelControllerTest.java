package com.anju.test;

/**
 * Uses JsonPath: http://goo.gl/nwXpb, Hamcrest and MockMVC
 */

import com.anju.Application;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = Application.class)
@Profile("test")
public class HotelControllerTest {

//    private static final String RESOURCE_LOCATION_PATTERN = "http://localhost/example/v1/hotels/[0-9]+";
//
//    @InjectMocks
//    HotelController controller;
//
//    @Autowired
//    WebApplicationContext context;
//
//    private MockMvc mvc;
//
//    @Before
//    public void initTests() {
//        MockitoAnnotations.initMocks(this);
//        mvc = MockMvcBuilders.webAppContextSetup(context).build();
//    }
//
//    //@Test
//    public void shouldHaveEmptyDB() throws Exception {
//        mvc.perform(get("/example/v1/hotels")
//                .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", hasSize(0)));
//    }
//
//    @Test
//    public void shouldCreateRetrieveDelete() throws Exception {
//        Hotel r1 = mockHotel("shouldCreateRetrieveDelete");
//        byte[] r1Json = toJson(r1);
//
//        //CREATE
//        MvcResult result = mvc.perform(post("/example/v1/hotels")
//                .content(r1Json)
//                .contentType(MediaType.APPLICATION_JSON)
//                .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isCreated())
//                .andExpect(redirectedUrlPattern(RESOURCE_LOCATION_PATTERN))
//                .andReturn();
//        long id = getResourceIdFromUrl(result.getResponse().getRedirectedUrl());
//
//        //RETRIEVE
//        mvc.perform(get("/example/v1/hotels/" + id)
//                .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id", is((int) id)))
//                .andExpect(jsonPath("$.name", is(r1.getName())))
//                .andExpect(jsonPath("$.city", is(r1.getCity())))
//                .andExpect(jsonPath("$.description", is(r1.getDescription())))
//                .andExpect(jsonPath("$.rating", is(r1.getRating())));
//
//        //DELETE
//        mvc.perform(delete("/example/v1/hotels/" + id))
//                .andExpect(status().isNoContent());
//
//        //RETRIEVE should fail
//        mvc.perform(get("/example/v1/hotels/" + id)
//                .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isNotFound());
//
//        //todo: you can test the 404 error body too.
//
///*
//JSONAssert.assertEquals(
//  "{foo: 'bar', baz: 'qux'}",
//  JSONObject.fromObject("{foo: 'bar', baz: 'xyzzy'}"));
// */
//    }
//
//    @Test
//    public void shouldCreateAndUpdateAndDelete() throws Exception {
//        Hotel r1 = mockHotel("shouldCreateAndUpdate");
//        byte[] r1Json = toJson(r1);
//        //CREATE
//        MvcResult result = mvc.perform(post("/example/v1/hotels")
//                .content(r1Json)
//                .contentType(MediaType.APPLICATION_JSON)
//                .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isCreated())
//                .andExpect(redirectedUrlPattern(RESOURCE_LOCATION_PATTERN))
//                .andReturn();
//        long id = getResourceIdFromUrl(result.getResponse().getRedirectedUrl());
//
//        Hotel r2 = mockHotel("shouldCreateAndUpdate2");
//        r2.setId(id);
//        byte[] r2Json = toJson(r2);
//
//        //UPDATE
//        result = mvc.perform(put("/example/v1/hotels/" + id)
//                .content(r2Json)
//                .contentType(MediaType.APPLICATION_JSON)
//                .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isNoContent())
//                .andReturn();
//
//        //RETRIEVE updated
//        mvc.perform(get("/example/v1/hotels/" + id)
//                .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id", is((int) id)))
//                .andExpect(jsonPath("$.name", is(r2.getName())))
//                .andExpect(jsonPath("$.city", is(r2.getCity())))
//                .andExpect(jsonPath("$.description", is(r2.getDescription())))
//                .andExpect(jsonPath("$.rating", is(r2.getRating())));
//
//        //DELETE
//        mvc.perform(delete("/example/v1/hotels/" + id))
//                .andExpect(status().isNoContent());
//    }
//
//
//    /*
//    ******************************
//     */
//
//    private long getResourceIdFromUrl(String locationUrl) {
//        String[] parts = locationUrl.split("/");
//        return Long.valueOf(parts[parts.length - 1]);
//    }
//
//
//    private Hotel mockHotel(String prefix) {
//        Hotel r = new Hotel();
//        r.setCity(prefix + "_city");
//        r.setDescription(prefix + "_description");
//        r.setName(prefix + "_name");
//        r.setRating(new Random().nextInt(6));
//        return r;
//    }
//
//    private byte[] toJson(Object r) throws Exception {
//        ObjectMapper map = new ObjectMapper();
//        return map.writeValueAsString(r).getBytes();
//    }
//
//    // match redirect header URL (aka Location header)
//    private static ResultMatcher redirectedUrlPattern(final String expectedUrlPattern) {
//        return new ResultMatcher() {
//            public void match(MvcResult result) {
//                Pattern pattern = Pattern.compile("\\A" + expectedUrlPattern + "\\z");
//                assertTrue(pattern.matcher(result.getResponse().getRedirectedUrl()).find());
//            }
//        };
//    }

}
