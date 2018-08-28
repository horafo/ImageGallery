package ua.kiev.prog;

import org.springframework.boot.CommandLineRunner;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(final UserService userService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                userService.addUser(new CustomUser("admin", "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8", UserRole.ADMIN));
                userService.addUser(new CustomUser("user", "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8", UserRole.USER));

            }
        };
    }


    @Bean
    public CommandLineRunner demo1(final AutoService autoService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
                autoService.addAuto(new Auto(0,0));
            }
        };
    }

    @Bean
    public CommandLineRunner demo2(final ArchitectureService architectureService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
                architectureService.addArchitecture(new Architecture(0,0));
            }
        };
    }

    @Bean
    public CommandLineRunner demo3(final BrandService brandService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                brandService.addBrand(new Brand(0,0));
                brandService.addBrand(new Brand(0,0));
                brandService.addBrand(new Brand(0,0));
                brandService.addBrand(new Brand(0,0));
                brandService.addBrand(new Brand(0,0));
                brandService.addBrand(new Brand(0,0));
                brandService.addBrand(new Brand(0,0));
                brandService.addBrand(new Brand(0,0));
                brandService.addBrand(new Brand(0,0));
                brandService.addBrand(new Brand(0,0));
                brandService.addBrand(new Brand(0,0));
                brandService.addBrand(new Brand(0,0));
                brandService.addBrand(new Brand(0,0));
                brandService.addBrand(new Brand(0,0));
                brandService.addBrand(new Brand(0,0));

            }
        };
    }

    @Bean
    public CommandLineRunner demo4(final GamesService gamesService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                gamesService.addGames(new Games(0,0));
                gamesService.addGames(new Games(0,0));
                gamesService.addGames(new Games(0,0));
                gamesService.addGames(new Games(0,0));
                gamesService.addGames(new Games(0,0));
                gamesService.addGames(new Games(0,0));
                gamesService.addGames(new Games(0,0));
                gamesService.addGames(new Games(0,0));
                gamesService.addGames(new Games(0,0));
                gamesService.addGames(new Games(0,0));
                gamesService.addGames(new Games(0,0));
                gamesService.addGames(new Games(0,0));
                gamesService.addGames(new Games(0,0));
                gamesService.addGames(new Games(0,0));
                gamesService.addGames(new Games(0,0));

            }
        };
    }

    @Bean
    public CommandLineRunner demo5(final FoodService foodService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                foodService.addFood(new Food(0,0));
                foodService.addFood(new Food(0,0));
                foodService.addFood(new Food(0,0));
                foodService.addFood(new Food(0,0));
                foodService.addFood(new Food(0,0));
                foodService.addFood(new Food(0,0));
                foodService.addFood(new Food(0,0));
                foodService.addFood(new Food(0,0));
                foodService.addFood(new Food(0,0));
                foodService.addFood(new Food(0,0));
                foodService.addFood(new Food(0,0));
                foodService.addFood(new Food(0,0));
                foodService.addFood(new Food(0,0));
                foodService.addFood(new Food(0,0));
                foodService.addFood(new Food(0,0));

            }
        };
    }

    @Bean
    public CommandLineRunner demo6(final FilmService filmService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                filmService.addFilm(new Film(0,0));
                filmService.addFilm(new Film(0,0));
                filmService.addFilm(new Film(0,0));
                filmService.addFilm(new Film(0,0));
                filmService.addFilm(new Film(0,0));
                filmService.addFilm(new Film(0,0));
                filmService.addFilm(new Film(0,0));
                filmService.addFilm(new Film(0,0));
                filmService.addFilm(new Film(0,0));
                filmService.addFilm(new Film(0,0));
                filmService.addFilm(new Film(0,0));
                filmService.addFilm(new Film(0,0));
                filmService.addFilm(new Film(0,0));
                filmService.addFilm(new Film(0,0));
                filmService.addFilm(new Film(0,0));

            }
        };
    }

    @Bean
    public CommandLineRunner demo7(final SpaceService spaceService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                spaceService.addSpace(new Space(0,0));
                spaceService.addSpace(new Space(0,0));
                spaceService.addSpace(new Space(0,0));
                spaceService.addSpace(new Space(0,0));
                spaceService.addSpace(new Space(0,0));
                spaceService.addSpace(new Space(0,0));
                spaceService.addSpace(new Space(0,0));
                spaceService.addSpace(new Space(0,0));
                spaceService.addSpace(new Space(0,0));
                spaceService.addSpace(new Space(0,0));
                spaceService.addSpace(new Space(0,0));
                spaceService.addSpace(new Space(0,0));
                spaceService.addSpace(new Space(0,0));
                spaceService.addSpace(new Space(0,0));
                spaceService.addSpace(new Space(0,0));

            }
        };
    }

    @Bean
    public CommandLineRunner demo8(final CartoonService cartoonService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                cartoonService.addCartoon(new Cartoon(0,0));
                cartoonService.addCartoon(new Cartoon(0,0));
                cartoonService.addCartoon(new Cartoon(0,0));
                cartoonService.addCartoon(new Cartoon(0,0));
                cartoonService.addCartoon(new Cartoon(0,0));
                cartoonService.addCartoon(new Cartoon(0,0));
                cartoonService.addCartoon(new Cartoon(0,0));
                cartoonService.addCartoon(new Cartoon(0,0));
                cartoonService.addCartoon(new Cartoon(0,0));
                cartoonService.addCartoon(new Cartoon(0,0));
                cartoonService.addCartoon(new Cartoon(0,0));
                cartoonService.addCartoon(new Cartoon(0,0));
                cartoonService.addCartoon(new Cartoon(0,0));
                cartoonService.addCartoon(new Cartoon(0,0));
                cartoonService.addCartoon(new Cartoon(0,0));

            }
        };
    }

    @Bean
    public CommandLineRunner demo9(final NatureService natureService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                natureService.addNature(new Nature(0,0));
                natureService.addNature(new Nature(0,0));
                natureService.addNature(new Nature(0,0));
                natureService.addNature(new Nature(0,0));
                natureService.addNature(new Nature(0,0));
                natureService.addNature(new Nature(0,0));
                natureService.addNature(new Nature(0,0));
                natureService.addNature(new Nature(0,0));
                natureService.addNature(new Nature(0,0));
                natureService.addNature(new Nature(0,0));
                natureService.addNature(new Nature(0,0));
                natureService.addNature(new Nature(0,0));
                natureService.addNature(new Nature(0,0));
                natureService.addNature(new Nature(0,0));
                natureService.addNature(new Nature(0,0));

            }
        };
    }

    @Bean
    public CommandLineRunner demo10(final SportService sportService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                sportService.addSport(new Sport(0,0));
                sportService.addSport(new Sport(0,0));
                sportService.addSport(new Sport(0,0));
                sportService.addSport(new Sport(0,0));
                sportService.addSport(new Sport(0,0));
                sportService.addSport(new Sport(0,0));
                sportService.addSport(new Sport(0,0));
                sportService.addSport(new Sport(0,0));
                sportService.addSport(new Sport(0,0));
                sportService.addSport(new Sport(0,0));
                sportService.addSport(new Sport(0,0));
                sportService.addSport(new Sport(0,0));
                sportService.addSport(new Sport(0,0));
                sportService.addSport(new Sport(0,0));
                sportService.addSport(new Sport(0,0));

            }
        };
    }

    @Bean
    public CommandLineRunner demo11(final AnimalsService animalsService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                animalsService.addAnimals(new Animals(0,0));
                animalsService.addAnimals(new Animals(0,0));
                animalsService.addAnimals(new Animals(0,0));
                animalsService.addAnimals(new Animals(0,0));
                animalsService.addAnimals(new Animals(0,0));
                animalsService.addAnimals(new Animals(0,0));
                animalsService.addAnimals(new Animals(0,0));
                animalsService.addAnimals(new Animals(0,0));
                animalsService.addAnimals(new Animals(0,0));
                animalsService.addAnimals(new Animals(0,0));
                animalsService.addAnimals(new Animals(0,0));
                animalsService.addAnimals(new Animals(0,0));
                animalsService.addAnimals(new Animals(0,0));
                animalsService.addAnimals(new Animals(0,0));
                animalsService.addAnimals(new Animals(0,0));

            }
        };
    }

    @Bean
    public CommandLineRunner demo12(final TransportService transportService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                transportService.addTransport(new Transport(0,0));
                transportService.addTransport(new Transport(0,0));
                transportService.addTransport(new Transport(0,0));
                transportService.addTransport(new Transport(0,0));
                transportService.addTransport(new Transport(0,0));
                transportService.addTransport(new Transport(0,0));
                transportService.addTransport(new Transport(0,0));
                transportService.addTransport(new Transport(0,0));
                transportService.addTransport(new Transport(0,0));
                transportService.addTransport(new Transport(0,0));
                transportService.addTransport(new Transport(0,0));
                transportService.addTransport(new Transport(0,0));
                transportService.addTransport(new Transport(0,0));
                transportService.addTransport(new Transport(0,0));
                transportService.addTransport(new Transport(0,0));

            }
        };
    }


}