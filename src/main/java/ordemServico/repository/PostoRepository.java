package ordemServico.repository;

import ordemServico.model.PostoColeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostoRepository extends JpaRepository<PostoColeta, Long> {
}
