# spring-thymeleaf-mail

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc

@TestConfiguration
static class test{
  @Controller
  DummyController {
    @GetMapping(URL)
    public String bla() { return "abc"}
  }
}

  @Autowired
  private MockMvc mockMvc;
  
  ockMvc.perform(get(PUBLIC_URL_PATH).with(request -> {
