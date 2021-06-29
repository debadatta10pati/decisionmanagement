[when]There is a customer with "{creditScore}" and "{loanUpperLimit}"  and "{loanLowerLimit}" and "{monthlyIncome}" =$c :CustomerData(income>={monthlyIncome}, loan>={loanLowerLimit},loan<{loanUpperLimit},creditScore>={creditScore})
[then]
Decide the Loan Approval as "{approval}"=$c.setLoanApproval("{approval}"); 
update ($c);
