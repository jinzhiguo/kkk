$.fn.extend({
	createTable:function(){
		for(var i =0;i<10;i++){
			var tr ="<tr>";
			tr+="<td>第一行</td>";
			tr+="<td>第二行</td>";
			tr+="<td>第三行</td>";
			tr+="<td>第四行</td>";
			tr+="<td>第五行</td>";
			tr+="</tr>";
			//把tr添加到table中
			
			$(this).append(tr);
		}
	},
	createTable2:function(obj){
		var rows=obj.rows;//多少行
		var colums=obj.colums;//多少列
		for(var r =0;r<rows;r++){
			var tr ="<tr>";
			for(var c =0;c<colums;c++){
				var td="<td>";
				td+="当前是第"+c+"列"+"</td>";
				tr+=td;
				
			}
			
			tr+="</tr>";
			$(this).append(tr);
		}
	},
	createTable3:function(obj){
		var rows =obj.rows;//获取所有要显示的数据
		for(var r=0;r<rows.length;r++){
			var currentrow=rows[r];//当前的每一条数据
			var tr="<tr>";
			tr+="<td>"+currentrow.id+"</td>";
			tr+="<td>"+currentrow.loginname+"</td>";
			tr+="<td>"+currentrow.nickname+"</td>";
			tr+="<td>"+currentrow.description+"</td>";
			tr+="<td>"+currentrow.departmentname+"</td>";
			tr+="</tr>";
			$(this).append(tr);
		}
		
	},
	
	
	createTable4:function(obj){
		var table=$(this);
		var colums =obj.colums;//所有的列
		var $thr="<tr>";
		for(var c =0;c <colums.length;c++){
			$thr+="<td>"+colums[c].title+"</td>"
		}
		$thr+="</tr>";
		table.append($thr);
		//根据传递过来的url发起异步请求
		$.ajax({
			url:obj.url,
			type:obj.type,
			success:function(data){
				var rows =data.rows;//获取所有要显示的数据
				for(var r=0;r<rows.length;r++){
					var currentrow=rows[r];//当前的每一条数据
					var tr="<tr>";
					tr+="<td>"+currentrow.id+"</td>";
					tr+="<td>"+currentrow.name+"</td>";
					tr+="<td>"+currentrow.gender+"</td>";
					
					tr+="</tr>";
					table.append(tr);
				}
				
			}
			
			
		})
	}
	
})