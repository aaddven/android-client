package com.mifos.mifosxdroid.offline.offlinedashbarod

import com.mifos.objects.accounts.loan.LoanRepaymentRequest
import com.mifos.objects.accounts.savings.SavingsAccountTransactionRequest
import com.mifos.objects.client.ClientPayload
import com.mifos.objects.group.GroupPayload
import com.mifos.services.data.CenterPayload
import rx.Observable

/**
 * Created by Aditya Gupta on 16/08/23.
 */
interface OfflineDashboardRepository {

    fun allDatabaseClientPayload(): Observable<List<ClientPayload>>

    fun allDatabaseGroupPayload(): Observable<List<GroupPayload>>

    fun allDatabaseCenterPayload(): Observable<List<CenterPayload>>

    fun databaseLoanRepayments(): Observable<List<LoanRepaymentRequest>>

    fun allSavingsAccountTransactions(): Observable<List<SavingsAccountTransactionRequest>>
}