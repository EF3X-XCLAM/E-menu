 document.addEventListener("DOMContentLoaded", () => {
        table_links = document.querySelectorAll(".my-link-table");
        back_btn = document.getElementById('back-btn');
        tables = document.getElementById('tables');

        table_links.forEach(link => {
        	link.onclick = () => {
        		table_id = link.dataset.tableid;
        		tab = document.querySelector(`.table-${table_id}`);
        		back_btn = document.getElementById(`back-btn-${table_id}`);
        		back_btn.onclick = () => {
		        	tables.classList.remove('d-none');
		        	closeInfo();
		        }
        		if (tab){
        			tables.classList.add('d-none');
        			tab.classList.remove('d-none');

        		}else{
        			alert("No info for this order");
        		}
        	}
        })

        function closeInfo(){
        	infos = document.querySelectorAll(".infos");
        	infos.forEach(info => {
        		info.classList.add('d-none');
        	})
        }


      })