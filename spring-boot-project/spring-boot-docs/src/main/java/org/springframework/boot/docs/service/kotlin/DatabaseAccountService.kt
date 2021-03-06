package org.springframework.boot.docs.service.kotlin

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Sample showing autowiring the [org.springframework.beans.factory.annotation.Autowired] annotation
 *
 * @author Ibanga Enoobong Ime
 */
// tag::customizer[]
@Service
class DatabaseAccountService @Autowired constructor(private val riskAssessor: RiskAssessor) : AccountService {
	//..
}

interface RiskAssessor

interface AccountService
// end::customizer[]
