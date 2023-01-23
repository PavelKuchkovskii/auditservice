package org.kucher.auditservice.service;

import org.kucher.auditservice.dao.api.IAuditDao;
import org.kucher.auditservice.dao.entity.Audit;
import org.kucher.auditservice.service.api.IAuditService;
import org.kucher.auditservice.service.dto.AuditDTO;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@Transactional(readOnly = true)
public class AuditService implements IAuditService {

    private final IAuditDao dao;
    private final ModelMapper mapper;

    public AuditService(IAuditDao dao, ModelMapper mapper) {
        this.dao = dao;
        this.mapper = mapper;
    }

    @Transactional
    @Override
    public AuditDTO create(AuditDTO auditDTO) {
        return null;
    }

    @Override
    public AuditDTO read(UUID uuid) {
        return null;
    }

    @Override
    public Page<AuditDTO> get(int page, int itemsPerPage) {
        return null;
    }

    @Transactional
    @Override
    public AuditDTO update(UUID uuid, LocalDateTime dtUpdate, AuditDTO auditDTO) {
        return null;
    }

    @Transactional
    @Override
    public void delete(UUID uuid, LocalDateTime dtUpdate) {

    }

    @Override
    public boolean validate(AuditDTO auditDTO) {
        return true;
    }

    @Override
    public AuditDTO mapToDTO(Audit audit) {
        return mapper.map(audit, AuditDTO.class);
    }

    @Override
    public Audit mapToEntity(AuditDTO auditDTO) {
        return null;
    }
}
