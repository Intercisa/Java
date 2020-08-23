package hu.ash.contractregistry.service.masterdata;

import hu.ash.contractregistry.dal.PaymentTypeRepository;
import hu.ash.contractregistry.entity.task.PaymentTypeEntity;
import hu.ash.contractregistry.model.PaymentType;
import hu.ash.contractregistry.service.base.BaseActiveModelService;
import hu.ash.contractregistry.service.base.ExpirationHandler;
import hu.ash.contractregistry.service.base.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class PaymentTypeService
        extends BaseActiveModelService<PaymentType, PaymentType, PaymentTypeEntity, PaymentTypeRepository>
        implements GenericService<PaymentType, PaymentType> {

    @Autowired
    public PaymentTypeService(PaymentTypeRepository repo) {super(repo);}

    @Override
    public PaymentType create(PaymentType model) {
        return createEntity(model, this::mapToEntity, this::mapToBusinessObject);
    }

    @Override
    public Optional<PaymentType> update(PaymentType model) {
        Optional<PaymentTypeEntity> maybeUser = repository.findById(model.getId());

        return maybeUser.map(entity -> updateEntity(mapToEntity(model, entity), this::mapToBusinessObject));
    }

    @Override
    public List<PaymentType> findAll() { return findAll(this::mapToBusinessObject); }

    @Override
    public List<PaymentType> findAllActive(Set<Long> ids) { return findAll(this::mapToBusinessObject, ids); }

    @Override
    public Optional<PaymentType> findById(Long id) { return findById(id, this::mapToBusinessObject); }

    private PaymentTypeEntity mapToEntity(PaymentType source){
        PaymentTypeEntity target = new PaymentTypeEntity();
        return mapToEntity(source, target);

    }

    private PaymentTypeEntity mapToEntity(PaymentType source, PaymentTypeEntity target) {
        target.setName(source.getName());
        target.setId(source.getId());
        return target;
    }

    private PaymentType mapToBusinessObject(PaymentTypeEntity source){
        PaymentType target = new PaymentType();
        target.setName(source.getName());
        target.setActive(ExpirationHandler.isActive(source));
        target.setId(source.getId());

        return target;
    }
}
