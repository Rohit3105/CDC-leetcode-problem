import pandas as pd

def modifySalaryColumn(employees: pd.DataFrame) -> pd.DataFrame:
    # Double the second column (index 1) values
    # employees['Salary'] = employees['Salary'] * 2
    employees.iloc[:, 1:2] = employees.iloc[:, 1:2] * 2
    return employees