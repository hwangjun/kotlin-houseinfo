package com.hj.houseinfo.repository

import com.hj.houseinfo.domain.area.Area
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AreaRepository : JpaRepository<Area, Long> {
}