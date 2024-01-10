package org.example.data.daos.seeders;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile({"dev", "test"})
public class DatabaseSeederServiceDev {
}
