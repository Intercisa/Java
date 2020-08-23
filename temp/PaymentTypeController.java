package hu.ash.contractregistry.backend.controller.masterdata;

import hu.ash.contractregistry.backend.controller.base.ActiveModelController;
import hu.ash.contractregistry.backend.security.AsnBasePermittedRoles;
import hu.ash.contractregistry.model.PaymentType;
import hu.ash.contractregistry.model.Role;
import hu.ash.contractregistry.service.masterdata.PaymentTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/paymenttype")
@AsnBasePermittedRoles(read = Role.PAYMENT_TYPE_VIEW, allModification = Role.PAYMENT_TYPE_VIEW)
public class PaymentTypeController extends ActiveModelController<PaymentType, PaymentType, PaymentTypeService> {

    public PaymentTypeController(PaymentTypeService service) {super(service);}

}
