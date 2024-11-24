from sentdm.paths.customers_id.get import ApiForget
from sentdm.paths.customers_id.put import ApiForput
from sentdm.paths.customers_id.delete import ApiFordelete


class CustomersId(
    ApiForget,
    ApiForput,
    ApiFordelete,
):
    pass
