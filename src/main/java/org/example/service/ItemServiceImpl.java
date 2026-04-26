package org.example.service;

import org.example.dto.ItemResponse;
import org.example.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Ici se trouve la logique metier.
 *
 * Le squelette ne laisse qu'un seul vrai exemple fonctionnel : findAll().
 * Le reste doit etre complete par les eleves.
 */
@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<ItemResponse> findAll() {
        // Exemple complet :
        // on lit les donnees depuis le repository
        // puis on transforme les entites en DTO de sortie.
        return itemRepository.findAll()
                .stream()
                .map(ItemResponse::fromEntity)
                .toList();
    }

    @Override
    public ItemResponse findById(Long id) {
        // TODO eleves :
        // 1. lire l'item depuis le repository
        // 2. gerer le cas ou l'item n'existe pas
        // 3. renvoyer un ItemResponse
        return null;
    }

    @Override
    public ItemResponse create(Object request) {
        // TODO eleves :
        // 1. remplacer Object par un vrai DTO d'entree
        // 2. appliquer les regles metier
        // 3. creer l'entite
        // 4. sauvegarder avec le repository
        // 5. renvoyer un ItemResponse
        return null;
    }

    @Override
    public ItemResponse update(Long id, Object request) {
        // TODO eleves :
        // 1. remplacer Object par un vrai DTO d'entree
        // 2. retrouver l'item en base
        // 3. modifier les champs utiles
        // 4. sauvegarder
        // 5. renvoyer un ItemResponse
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO eleves :
        // 1. retrouver l'item
        // 2. le supprimer
        // 3. reflechir au comportement si l'id n'existe pas
    }
}
